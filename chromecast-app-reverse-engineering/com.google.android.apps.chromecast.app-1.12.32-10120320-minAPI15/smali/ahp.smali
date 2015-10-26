.class final enum Lahp;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Lahp;

.field public static final enum b:Lahp;

.field private static enum c:Lahp;

.field private static enum d:Lahp;

.field private static enum e:Lahp;

.field private static enum f:Lahp;

.field private static final synthetic g:[Lahp;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 632
    new-instance v0, Lahp;

    const-string v1, "EXPLICIT"

    invoke-direct {v0, v1, v3}, Lahp;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lahp;->c:Lahp;

    .line 633
    new-instance v0, Lahp;

    const-string v1, "TIMER"

    invoke-direct {v0, v1, v4}, Lahp;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lahp;->a:Lahp;

    .line 634
    new-instance v0, Lahp;

    const-string v1, "SESSION_CHANGE"

    invoke-direct {v0, v1, v5}, Lahp;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lahp;->d:Lahp;

    .line 635
    new-instance v0, Lahp;

    const-string v1, "PERSISTED_EVENTS"

    invoke-direct {v0, v1, v6}, Lahp;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lahp;->e:Lahp;

    .line 636
    new-instance v0, Lahp;

    const-string v1, "EVENT_THRESHOLD"

    invoke-direct {v0, v1, v7}, Lahp;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lahp;->b:Lahp;

    .line 637
    new-instance v0, Lahp;

    const-string v1, "EAGER_FLUSHING_EVENT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lahp;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lahp;->f:Lahp;

    .line 630
    const/4 v0, 0x6

    new-array v0, v0, [Lahp;

    sget-object v1, Lahp;->c:Lahp;

    aput-object v1, v0, v3

    sget-object v1, Lahp;->a:Lahp;

    aput-object v1, v0, v4

    sget-object v1, Lahp;->d:Lahp;

    aput-object v1, v0, v5

    sget-object v1, Lahp;->e:Lahp;

    aput-object v1, v0, v6

    sget-object v1, Lahp;->b:Lahp;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lahp;->f:Lahp;

    aput-object v2, v0, v1

    sput-object v0, Lahp;->g:[Lahp;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 631
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lahp;
    .locals 1

    .prologue
    .line 630
    const-class v0, Lahp;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lahp;

    return-object v0
.end method

.method public static values()[Lahp;
    .locals 1

    .prologue
    .line 630
    sget-object v0, Lahp;->g:[Lahp;

    invoke-virtual {v0}, [Lahp;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lahp;

    return-object v0
.end method
