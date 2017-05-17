cmake_minimum_required(VERSION 3.7)
project(C_Code)

set(CMAKE_C_STANDARD 99)

set(SOURCE_FILES "C Code/main.c")
add_executable(C_Code ${SOURCE_FILES})