.class public final enum Ladu;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Ladu;

.field public static final enum b:Ladu;

.field private static enum c:Ladu;

.field private static enum d:Ladu;

.field private static final synthetic e:[Ladu;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 494
    new-instance v0, Ladu;

    const-string v1, "LOW"

    invoke-direct {v0, v1, v2}, Ladu;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ladu;->a:Ladu;

    .line 495
    new-instance v0, Ladu;

    const-string v1, "NORMAL"

    invoke-direct {v0, v1, v3}, Ladu;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ladu;->b:Ladu;

    .line 496
    new-instance v0, Ladu;

    const-string v1, "HIGH"

    invoke-direct {v0, v1, v4}, Ladu;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ladu;->c:Ladu;

    .line 497
    new-instance v0, Ladu;

    const-string v1, "IMMEDIATE"

    invoke-direct {v0, v1, v5}, Ladu;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ladu;->d:Ladu;

    .line 493
    const/4 v0, 0x4

    new-array v0, v0, [Ladu;

    sget-object v1, Ladu;->a:Ladu;

    aput-object v1, v0, v2

    sget-object v1, Ladu;->b:Ladu;

    aput-object v1, v0, v3

    sget-object v1, Ladu;->c:Ladu;

    aput-object v1, v0, v4

    sget-object v1, Ladu;->d:Ladu;

    aput-object v1, v0, v5

    sput-object v0, Ladu;->e:[Ladu;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 493
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ladu;
    .locals 1

    .prologue
    .line 493
    const-class v0, Ladu;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Ladu;

    return-object v0
.end method

.method public static values()[Ladu;
    .locals 1

    .prologue
    .line 493
    sget-object v0, Ladu;->e:[Ladu;

    invoke-virtual {v0}, [Ladu;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ladu;

    return-object v0
.end method
