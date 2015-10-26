.class public final Lady;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ladh;

.field public final c:Laef;

.field public d:Z


# direct methods
.method private constructor <init>(Laef;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    const/4 v0, 0x0

    iput-boolean v0, p0, Lady;->d:Z

    .line 81
    iput-object v1, p0, Lady;->a:Ljava/lang/Object;

    .line 82
    iput-object v1, p0, Lady;->b:Ladh;

    .line 83
    iput-object p1, p0, Lady;->c:Laef;

    .line 84
    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Ladh;)V
    .locals 1

    .prologue
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    const/4 v0, 0x0

    iput-boolean v0, p0, Lady;->d:Z

    .line 75
    iput-object p1, p0, Lady;->a:Ljava/lang/Object;

    .line 76
    iput-object p2, p0, Lady;->b:Ladh;

    .line 77
    const/4 v0, 0x0

    iput-object v0, p0, Lady;->c:Laef;

    .line 78
    return-void
.end method

.method public static a(Laef;)Lady;
    .locals 1

    .prologue
    .line 51
    new-instance v0, Lady;

    invoke-direct {v0, p0}, Lady;-><init>(Laef;)V

    return-object v0
.end method

.method public static a(Ljava/lang/Object;Ladh;)Lady;
    .locals 1

    .prologue
    .line 43
    new-instance v0, Lady;

    invoke-direct {v0, p0, p1}, Lady;-><init>(Ljava/lang/Object;Ladh;)V

    return-object v0
.end method
