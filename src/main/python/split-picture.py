import os
import cv2
import numpy as np

## Takes an image stored in resources directory, splits it in m x n pieces, and
## detemines the slice with the most red by calculating a red score based on 
## BGR values.
##
## @author cameronDz

# import picture and get height/width properties
img = cv2.imread('src/main/resources/cars.jpg')
height, width = img.shape[:2]

# make sure there is a target directory
try:
    os.mkdir('target/')
except:
    print('') # do nothing

# get user input and determine section sizes
m = input('Number of rows: ')
n = input('Number of columns: ')
heightSectionSize = height/m
widthSectionSize = width/n

# function for creating file name
# @param m assumed to be m value for file row
# @param n assumd to be n value for file column
def create_file_name(m, n):
    return 'target/m' + str(m) + 'n' + str(n) + '.jpg';

# function for splitting image into it's respective m x n section
# @param m assumed to be m value for file row
# @param n assumd to be n value for file column
def create_cut_image(m, n):
    rowStart = heightSectionSize * m
    rowEnd = heightSectionSize * (m + 1)
    colStart = widthSectionSize * n
    colEnd = widthSectionSize * (n + 1)
    return img[rowStart:rowEnd, colStart:colEnd];

# function for determining red score of a picture
# @param cutImg is section of image being analyzed for red score
def determine_red_score(cutImg):
    cutRedScore = 0
    # loop through each pixel in image height/width
    cutHeight, cutWidth = cutImg.shape[:2]
    for a in range(cutHeight):
        for b in range(cutWidth):
            # get bgr values in tuple
            color = cutImg[a, b]
            # if R is greater than combination of B and G, add to score
            if(int(color[2]) > (int(color[0]) + int(color[1]))):
                cutRedScore += 1
    return cutRedScore

# set default red score and highest value name
redScore = 0
highRedName = ''

# loop through rows, cut each row into column
for a in range(m):
    for b in range(n):
        # name and save image
        name = create_file_name(a, b)
        cutImg = create_cut_image(a, b)
        cv2.imwrite(name, cutImg)
        
        # determine red score value
        cutRedScore = determine_red_score(cutImg)
        if(cutRedScore > redScore):
            redScore = cutRedScore
            highRedName = name

print('red score value: ' + str(redScore))
print('red score img: ' + highRedName)
print('end')
