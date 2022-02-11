im = imread('dod.png');
im_gary = rgb2gray(im)

imwrite(im_gary, 'grayScale_wa.tif');

imshow(im_gary, [100 180])