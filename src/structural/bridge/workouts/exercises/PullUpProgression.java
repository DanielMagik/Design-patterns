package structural.bridge.workouts.exercises;

public enum PullUpProgression
{
    WALL_PULL_UP
            {
                public String getProgressionStatus()
                {
                   return "wall pull up. The easiest progression. \n" +
                            "Everyone started out once.";
                }
            },
    AUSTRALIAN_PULL_UP
            {
                public String getProgressionStatus()
                {
                    return "australian pull up. Quite easy progression.";
                }
            },
    NEGATIVE_PULL_UP
            {
                public String getProgressionStatus()
                {
                    return "negative pull up. If normal pull-ups are too hard, try this.";
                }
            },
    PULL_UP
            {
                public String getProgressionStatus()
                {
                    return "pull up. Normal, but quite hard.";
                }
            },
    ARCHER_PULL_UP
            {
                public String getProgressionStatus()
                {
                    return "archer pull up. Hard progression.";
                }
            },
    NEGATIVE_ONE_ARM_PULL_UP
            {
                public String getProgressionStatus()
                {
                    return "negative one arm pull up. You're strong.";
                }
            },
    ONE_ARM_PULL_UP
            {
                public String getProgressionStatus()
                {
                    return "one arm pull-up. You're master.";
                }
            };

    public abstract String getProgressionStatus();
}
