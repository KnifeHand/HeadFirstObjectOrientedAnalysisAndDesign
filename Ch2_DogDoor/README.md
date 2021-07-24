# Chapter 2 - Requirements (The Use Case)
**A use case is a technique for capturing the potential requirements of a new 
system or software change. Each use case provides one or more scenarios that 
convey how the system should interact with the end user or another system to
achieve a specific goal.**

There are three parts to a good use case.
1. Clear Value: The product must help the customer.
   - Without this, a use case isn't worth anything to anyone. Use cases without
     this always fail.
2. Start and Stop Conditions: Every use case has a starting and stopping point.
    - Something needs to begin the process, and then a condition that completes it.
        - Start Condition: This is always the first step in the use case.
        - Stop Condition: Lets you know when a use case is finished. Without this, use
      cases can go on forever.
3. External Initiator: Every use case is started by something outside of the system.
    - Sometimes that initiator is a person.
    - Anything not apart of the internal system.
    
If your system does more than one thing, then you'll need more than one use case.
The system will need a use case for every goal it accomplishes. Essentially, the 
use case is what the system does to accomplish the goal. If you write down what 
the system needs to do to perform a task, you've probably got a use case. As a 
general rule, your use cases should use simple, everyday language. 

If you're using lots of programming terms, or technical jargon, your use case 
is probably getting to detailed to be useful. Use cases are meant to help you
understand what a system should do and explain the system to others.

## "**It's a specific thing your system has to do to work correctly.**"
A requirement is a singular need detailing what a particular product or service
should be or do. It is most commonly used in a formal sense in systems engineering
or software engineering.

When it comes to requirements, the best thing you can do is **let the customer talk**.
And pay attention to what the system needs to do; you can figure out *how* the 
system will do those things later.

Sometimes, even the *customer* doesn't know what they really want! So you've
got to ask the customer questions to figure out what they want before you can
determine exactly what the system should do. Then, you can begin to think 
*beyond* what your customers asked for and anticipate their needs, even before
they realize they have a problem.

### It's a Specific thing
> A requirement is usually a *single* thing, and you can *test* that thing to make
sure you've actually fulfilled the requirement.

### your System
> Is the complete app or project you're working on. In this case, your system is 
the dog door setup which includes the remote control.

### has to Do
> The system has to "do" lot of things. Anything that the client comes up with is 
part of what the system "does".

### to work Correctly
> The customer decides when a system works correctly. So if you leave out a 
requirement or even if they forget to mention something to you, the system 
isn't working correctly!

## Plan for things going wrong
> Things aren't always going to go according to plan. Brainstorm the things
> that can go wrong along the way.

## Alternate paths handle system problems
> Write down what should happen if the system does not behave as intended.
> 
> Example:
> 1. Event that queues process.
> 2. Process triggered.
> 3. Process begins.
> 4. Process occurs.
> 5. Other things to do with the process happen.
>   - 5.1 *'use sub-numbers to show some sub-steps that might happen as part 
            of step 5.*
> 6. Customer goal complete. 

## Checking the requirements against the use cases
Once you've got an initial set of requirements and a use case for them, you'll
go back to the requirements. You are making sure that the requirements cover 
everything your system has to do. 
> Example: Requirements
> 1. Customer needs something.
> 2. They need something else that to go with the first thing.
> 3. Customer defines conditions that completes the requirements.

> Example: Use case
> 1. External initiator
> 2. Start process
> 3. Stop process

## Your System must work in the real world...
#### so plan and test for when things go wrong...
How would you change the DogDoorSimulator class to test for Fido staying outside
longer? Can you come up with at least one more alternate path for the Customers?
Write out the use case and update the requirements list for you new alternate 
path.

First make sure you understand exactly what happens on the alternate path and 
then update the program to test the new path out.

> Example: Use case
> 1. Main path (External initiator).
> 2. Main path (Start Condition).
>   - 2.1 - Alternate path start (external initiator).
>   - 2.2 - Alternate path process.
>   - 2.3 - Alternate path stop, go to case 3.
> 3. Main path (Stop Condition)

The Main path is how a system works when everything is going right. This is 
usually what customers describe when they're talking about the system.