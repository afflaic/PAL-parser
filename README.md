# PAL-parser
A small parser for a made up assembly language

This parser defines the syntax for the made up PAL(pico assembly language) It is written in C++ and is currently being run in Visual Studio Ultimate 2013. It will later be modified to run as an exe file.<br />
<br />
The PAL is defined as follows:<br />
<br />
Typical Three-Address/Operand Instruction Set<br />
Instruction Meaning Notes<br />
COPY s, d s -> d copy<br />
MOVE v, d v -> d move<br />
ADD s1, s2, d s1 + s2 -> d<br />
INC s s + 1 -> s increment<br />
SUB s1, s2, d s1 – s2 -> d<br />
DEC s s – 1 -> s decrement<br />
MUL s1, s2, d s1 * s2 -> d<br />
DIV s1, s2, d s1 / s2 -> d Integer division<br />
BEQ s1, s2, addr if s1 == s2 branch if equal<br />
 branch to address addr<br />
BGT s1, s2, addr if s1 > s2 branch if greater than<br />
 branch to address addr<br />
BR addr branch to address addr unconditional branch (goto)<br />
END halts program<br />
--------<br />
notes<br />
• s, s1, and s2 are source locations; d is a destination location; addr is a memory location (label)<br />
o sources and destinations may be a named memory location or a register<br />
o there are 8 registers, named R0 through R7<br />
o memory identifiers are composed of letters only, max length of 5<br />
• v is an immediate value<br />
o all numeric data is of type unsigned integer, represented in octal<br />
• labels (on a line of code) are terminated by a colon<br />
• note that comparisons are part of the branch instructions<br />
• one instruction per line<br />
• white space will be spaces only (no tabs)<br />
o commas in operand lists may be followed by zero or more spaces<br />
o spaces may appear after the end of the instruction<br />
o colons in labels may be followed by zero or more spaces<br />
o instructions may be followed by zero or more spaces<br />
• comments begin with a semi-colon and end with EOL; they may be on a line alone, or following code on a line<br />

Author: Nick Miller<br />
The syntax for PAL was created as a school assignment and I take no credit in the creation or naming of the language.
