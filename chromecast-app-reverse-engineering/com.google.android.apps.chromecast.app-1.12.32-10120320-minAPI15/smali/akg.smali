.class public final enum Lakg;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Lakg;

.field private static enum d:Lakg;

.field private static enum e:Lakg;

.field private static final synthetic f:[Lakg;


# instance fields
.field final b:Z

.field final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 31
    new-instance v0, Lakg;

    const-string v1, "NATIVE_WITH_FALLBACK"

    invoke-direct {v0, v1, v3, v2, v2}, Lakg;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Lakg;->a:Lakg;

    .line 37
    new-instance v0, Lakg;

    const-string v1, "NATIVE_ONLY"

    invoke-direct {v0, v1, v2, v2, v3}, Lakg;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Lakg;->d:Lakg;

    .line 42
    new-instance v0, Lakg;

    const-string v1, "WEB_ONLY"

    invoke-direct {v0, v1, v4, v3, v2}, Lakg;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Lakg;->e:Lakg;

    .line 26
    const/4 v0, 0x3

    new-array v0, v0, [Lakg;

    sget-object v1, Lakg;->a:Lakg;

    aput-object v1, v0, v3

    sget-object v1, Lakg;->d:Lakg;

    aput-object v1, v0, v2

    sget-object v1, Lakg;->e:Lakg;

    aput-object v1, v0, v4

    sput-object v0, Lakg;->f:[Lakg;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZZ)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 48
    iput-boolean p3, p0, Lakg;->b:Z

    .line 49
    iput-boolean p4, p0, Lakg;->c:Z

    .line 50
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lakg;
    .locals 1

    .prologue
    .line 26
    const-class v0, Lakg;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lakg;

    return-object v0
.end method

.method public static values()[Lakg;
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lakg;->f:[Lakg;

    invoke-virtual {v0}, [Lakg;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lakg;

    return-object v0
.end method
