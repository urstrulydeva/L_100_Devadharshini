SINGLETON PATTERN:

This pattern is often used when we want only one instance of a class to exist throughout the lifetime of the application.
In general, this pattern is used for logging, managing thread pools, caching and application state management in coding scenarios.

SINGLETON CAN BE PREFERRED IN:

-> Global configuration / settings
-> Shared Resources that are being accessed across the code - say DB connections, state variables etc - where the changes made has to reflect in
consistent manner.
-> Resource intensive intialization

SINGLETON HAS TO BE AVOIDED IF:

->Multiple instances are required
->Stateless classes


HOW IS SINGLETON DIFFERENT FROM FACTORY PATTERN:

Singleton often restricts instantiation to one and only one instance globally.
However, factory pattern enables the single time instantiation done in various scopes - session, thread, user etc.


The use case explained here:
In music applications such as Spotify, Amazon music etc, there will be multiple screens such as home screen, now playing, search etc, through which the control 
to play an audio can be accessed. Here it must be ensured that only one media player controller instance is present, to avoid playing more than one audio at a time
which might spoil user experience.

A singleton media player shall ensure that:
-> A single player used across multiple parts of an app.
-> Start, pause, play, resume and skip music consistently.

A singleton shall ensure -> Centralized audio control, State management and Access control.