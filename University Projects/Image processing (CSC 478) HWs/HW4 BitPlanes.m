im = imread('grayScale_wa.tif');
im_double = double(im);

c0=mod(im_double,2);
c1=mod(floor(im_double/2),2);
c2=mod(floor(im_double/4),2);
c3=mod(floor(im_double/8),2);
c4=mod(floor(im_double/16),2);
c5=mod(floor(im_double/32),2);
c6=mod(floor(im_double/64),2);
c7=mod(floor(im_double/128),2);

%A = cat(2, c0, c1, c2, c3, c4, c5, c6, c7)
%for i = 1:length(A)
%    imshow(A(i,i))
%    pause(1)
%end
imshow(c0)
pause(1)
imshow(c1)
pause(1)
imshow(c2)
pause(1)
imshow(c3)
pause(1)
imshow(c4)
pause(1)
imshow(c5)
pause(1)
imshow(c6)
pause(1)
imshow(c7)
pause(1)

cc=2*(2*(2*(2*(2*(2*(2*c7+c6)+c5)+c4)+c3)+c2)+c1)+c0;
imshow(uint8(cc))