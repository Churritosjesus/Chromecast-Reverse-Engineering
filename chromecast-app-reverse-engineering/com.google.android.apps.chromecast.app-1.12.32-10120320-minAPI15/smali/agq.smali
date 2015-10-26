.class public final enum Lagq;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Lagq;

.field public static final enum b:Lagq;

.field private static enum c:Lagq;

.field private static final synthetic d:[Lagq;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 30
    new-instance v0, Lagq;

    const-string v1, "GET"

    invoke-direct {v0, v1, v2}, Lagq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lagq;->a:Lagq;

    .line 35
    new-instance v0, Lagq;

    const-string v1, "POST"

    invoke-direct {v0, v1, v3}, Lagq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lagq;->b:Lagq;

    .line 40
    new-instance v0, Lagq;

    const-string v1, "DELETE"

    invoke-direct {v0, v1, v4}, Lagq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lagq;->c:Lagq;

    .line 26
    const/4 v0, 0x3

    new-array v0, v0, [Lagq;

    sget-object v1, Lagq;->a:Lagq;

    aput-object v1, v0, v2

    sget-object v1, Lagq;->b:Lagq;

    aput-object v1, v0, v3

    sget-object v1, Lagq;->c:Lagq;

    aput-object v1, v0, v4

    sput-object v0, Lagq;->d:[Lagq;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lagq;
    .locals 1

    .prologue
    .line 26
    const-class v0, Lagq;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lagq;

    return-object v0
.end method

.method public static values()[Lagq;
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lagq;->d:[Lagq;

    invoke-virtual {v0}, [Lagq;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lagq;

    return-object v0
.end method
