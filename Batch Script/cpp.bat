@echo off
echo Enter file path 
set /p"path1=>"
echo Enter file name without extension 
set /p"file=>" 
%path1:~0, 2% 
cd %path1%
set ext=.cpp
gcc -g %file%%ext% -o %file%
pause