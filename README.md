# Circular Dependencies in Spring
When two things depend on each other and can’t start without the other, that’s called a circular dependency. For example, if ‘bean A’ needs ‘bean B’ to work, but ‘bean B’ also needs ‘bean A’ to start, then we have a circular dependency. This can also happen with more beans involved, like if ‘bean A’ needs ‘bean B’, which needs ‘bean C’, and so on, until eventually ‘bean E’ needs ‘bean A’ again.

## Article
https://youssefameachaq.com/blog/spring/circular-dependencies-in-spring/ 