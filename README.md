# PAL-parser
A small parser for a made up assembly language

This parser defines the syntax for the made up PAL(pico assembly language) It is written in C++ and is currently being run in Visual Studio 
Ultimate 2013. It will later be modified to run as an exe file.

The PAL is defined as follows:

Typical Three-Address/Operand Instruction Set
Instruction Meaning Notes
COPY s, d s ® d copy
MOVE v, d v ® d move
ADD s1, s2, d s1 + s2 ® d
INC s s + 1 ® s increment
SUB s1, s2, d s1 – s2 ® d
DEC s s – 1 ® s decrement
MUL s1, s2, d s1 * s2 ® d
DIV s1, s2, d s1 / s2 ® d I nteger division
BEQ s1, s2, addr if s1 == s2 branch if equal
 branch to address addr
BGT s1, s2, addr if s1 > s2 branch if greater than
 branch to address addr
BR addr branch to address addr unconditional branch (goto)
END halts program
--------
notes
• s, s1, and s2 are source locations; d is a destination location; addr is a memory location (label)
o sources and destinations may be a named memory location or a register
o there are 8 registers, named R0 through R7
o memory identifiers are composed of letters only, max length of 5
• v is an immediate value
o all numeric data is of type unsigned integer, represented in octal
• labels (on a line of code) are terminated by a colon
• note that comparisons are part of the branch instructions
• one instruction per line
• white space will be spaces only (no tabs)
o commas in operand lists may be followed by zero or more spaces
o spaces may appear after the end of the instruction
o colons in labels may be followed by zero or more spaces
o instructions may be followed by zero or more spaces
• comments begin with a semi-colon and end with EOL; they may be on a line alone, or following code on a line

Author: Nick Miller
The syntax for PAL was created as a school assignment and I take no credit in the creation or naming of the language.
