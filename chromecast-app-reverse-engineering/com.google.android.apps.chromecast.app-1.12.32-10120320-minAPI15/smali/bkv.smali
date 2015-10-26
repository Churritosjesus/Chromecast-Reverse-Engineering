.class final Lbkv;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Z

.field final b:Lblc;


# direct methods
.method private constructor <init>(Lblc;)V
    .locals 1

    .prologue
    .line 498
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lbkv;-><init>(Lblc;Z)V

    .line 499
    return-void
.end method

.method private constructor <init>(Lblc;Z)V
    .locals 0

    .prologue
    .line 501
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 502
    iput-object p1, p0, Lbkv;->b:Lblc;

    .line 503
    iput-boolean p2, p0, Lbkv;->a:Z

    .line 504
    return-void
.end method

.method public static a(Ljava/lang/String;)Lbkv;
    .locals 2

    .prologue
    .line 507
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 508
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "separator may not be empty or null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 511
    :cond_0
    new-instance v0, Lbkv;

    new-instance v1, Lbkw;

    invoke-direct {v1, p0}, Lbkw;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lbkv;-><init>(Lblc;)V

    return-object v0
.end method


# virtual methods
.method public final a()Lbkv;
    .locals 3

    .prologue
    .line 541
    new-instance v0, Lbkv;

    iget-object v1, p0, Lbkv;->b:Lblc;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lbkv;-><init>(Lblc;Z)V

    return-object v0
.end method

.method public final a(Ljava/lang/CharSequence;)Ljava/lang/Iterable;
    .locals 1

    .prologue
    .line 545
    new-instance v0, Lbky;

    invoke-direct {v0, p0, p1}, Lbky;-><init>(Lbkv;Ljava/lang/CharSequence;)V

    return-object v0
.end method
