.class final enum Lahq;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Lahq;

.field public static final enum b:Lahq;

.field public static final enum c:Lahq;

.field private static enum d:Lahq;

.field private static final synthetic e:[Lahq;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 642
    new-instance v0, Lahq;

    const-string v1, "SUCCESS"

    invoke-direct {v0, v1, v2}, Lahq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lahq;->a:Lahq;

    .line 643
    new-instance v0, Lahq;

    const-string v1, "SERVER_ERROR"

    invoke-direct {v0, v1, v3}, Lahq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lahq;->b:Lahq;

    .line 644
    new-instance v0, Lahq;

    const-string v1, "NO_CONNECTIVITY"

    invoke-direct {v0, v1, v4}, Lahq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lahq;->c:Lahq;

    .line 645
    new-instance v0, Lahq;

    const-string v1, "UNKNOWN_ERROR"

    invoke-direct {v0, v1, v5}, Lahq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lahq;->d:Lahq;

    .line 640
    const/4 v0, 0x4

    new-array v0, v0, [Lahq;

    sget-object v1, Lahq;->a:Lahq;

    aput-object v1, v0, v2

    sget-object v1, Lahq;->b:Lahq;

    aput-object v1, v0, v3

    sget-object v1, Lahq;->c:Lahq;

    aput-object v1, v0, v4

    sget-object v1, Lahq;->d:Lahq;

    aput-object v1, v0, v5

    sput-object v0, Lahq;->e:[Lahq;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 641
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lahq;
    .locals 1

    .prologue
    .line 640
    const-class v0, Lahq;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lahq;

    return-object v0
.end method

.method public static values()[Lahq;
    .locals 1

    .prologue
    .line 640
    sget-object v0, Lahq;->e:[Lahq;

    invoke-virtual {v0}, [Lahq;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lahq;

    return-object v0
.end method
