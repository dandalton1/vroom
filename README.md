# vroom

The first language that features car noises.

# Differences between Vroom and Java

| Vroom    | Java         |
| -------- | ------------ |
| Is a car | Is not a car |

Clearly, vroom is the best language.

# Implementation Time

This is where we record progress of a longer-running vroom program, "Hello, world!"

| Commit ID | Execution Time (ms) | Notes                                         |
| --------- | ------------------- | --------------------------------------------- |
| `e8560d2` | 60                  | Moved to using `ArrayList` instead of `Stack` |
| `4347f21` | 80                  | Initial Trial                                 |

# Syntax of vroom

Vroom takes keywords. These keywords work with a stack.

- `BUM` - Pop top of stack
- `BRUM` - Increment top of stack by 1
- `CLUNK` - Decrement top of stack by 1
- `VROOM` - Pop stack and output value as a Unicode character
- `NYEUM` - Pop stack and output value as a decimal
- `CLIK` - Push a 0 onto the stack
- `BEEP` - Add top two values of stack, then push result on top of stack.
- `HONK` - Only execute if top of stack is non-zero; otherwise program execution skips to next `HONK`.
- `ZOOM` - User inputs a decimal value. This value is read and pushed to the top of the stack.
- `SKRT` - Halt execution

# Examples

Adding two numbers input by a user and reading it out in vroom:

```
    BUM ZOOM ZOOM BEEP NYEUM SKRT
```
This example works by popping the initial `0`, then reading in two numbers with `ZOOM`,
then using `BEEP` to add them, `NYEUM` to output as decimal, and then `SKRT` to stop.

Outputting "Hello, world!":

```
    BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM VROOM
    CLIK BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM VROOM
    CLIK BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM VROOM
    CLIK BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM VROOM
    CLIK BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM VROOM
    CLIK BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM VROOM
    CLIK BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM VROOM
    CLIK BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM VROOM
    CLIK BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM VROOM
    CLIK BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM VROOM
    CLIK BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM VROOM
    CLIK BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM VROOM
    CLIK BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM BRUM VROOM
    SKRT
```
This works by repetitively incrementing the top of stack with `BRUM` to be the right
Unicode character, then using `VROOM` to output it, then `CLIK` pushes a new 0 to the
top of the stack, and the process begins again.

Checking conditional statements:
```
    BRUM
    HONK
        CLUNK CLUNK NYEUM
    HONK
    CLIK
    HONK
        NYEUM
    HONK
    NYEUM
    SKRT
```
This should output `01`.

The initial `BRUM` adds 1 to the top of the stack. If `HONK` is implemented correctly,
execution will skip to until the next `HONK`, printing nothing. If `HONK` is not
implemented correctly, execution will continue, and the two `CLUNK` statements 
will decrement the stack, which outputs `65535` before the first `0`.

The `CLIK` pushes a `0` to the top of the stack. If `HONK` is implemented correctly,
`NYEUM` will execute, popping/printing the `0`. The ending `HONK` is skipped due to
the first `HONK`. The next `NYEUM` will pop/print a `1` (the `1` from earlier), and the
`SKRT` ends the program.

# The stack's initial value

The stack is initialized with a single 0.
