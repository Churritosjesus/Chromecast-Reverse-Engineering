.class public final enum Lajy;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Lajy;

.field private static enum c:Lajy;

.field private static enum d:Lajy;

.field private static enum e:Lajy;

.field private static final synthetic f:[Lajy;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 35
    new-instance v0, Lajy;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v3, v2}, Lajy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lajy;->c:Lajy;

    .line 40
    new-instance v0, Lajy;

    const-string v1, "ONLY_ME"

    const-string v2, "only_me"

    invoke-direct {v0, v1, v4, v2}, Lajy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lajy;->d:Lajy;

    .line 45
    new-instance v0, Lajy;

    const-string v1, "FRIENDS"

    const-string v2, "friends"

    invoke-direct {v0, v1, v5, v2}, Lajy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lajy;->a:Lajy;

    .line 50
    new-instance v0, Lajy;

    const-string v1, "EVERYONE"

    const-string v2, "everyone"

    invoke-direct {v0, v1, v6, v2}, Lajy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lajy;->e:Lajy;

    .line 31
    const/4 v0, 0x4

    new-array v0, v0, [Lajy;

    sget-object v1, Lajy;->c:Lajy;

    aput-object v1, v0, v3

    sget-object v1, Lajy;->d:Lajy;

    aput-object v1, v0, v4

    sget-object v1, Lajy;->a:Lajy;

    aput-object v1, v0, v5

    sget-object v1, Lajy;->e:Lajy;

    aput-object v1, v0, v6

    sput-object v0, Lajy;->f:[Lajy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 55
    iput-object p3, p0, Lajy;->b:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lajy;
    .locals 1

    .prologue
    .line 31
    const-class v0, Lajy;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lajy;

    return-object v0
.end method

.method public static values()[Lajy;
    .locals 1

    .prologue
    .line 31
    sget-object v0, Lajy;->f:[Lajy;

    invoke-virtual {v0}, [Lajy;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lajy;

    return-object v0
.end method
