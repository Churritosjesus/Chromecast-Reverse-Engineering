.class public Lcu;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lcv;

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 343
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 341
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcu;->c:Z

    .line 344
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 345
    new-instance v0, Lcw;

    .line 1436
    invoke-direct {v0, p0}, Lcw;-><init>(Lcu;)V

    .line 2042
    new-instance v1, Ldg;

    invoke-direct {v1, v0}, Ldg;-><init>(Ldf;)V

    .line 345
    iput-object v1, p0, Lcu;->a:Ljava/lang/Object;

    .line 349
    :goto_0
    return-void

    .line 347
    :cond_0
    new-instance v0, Lcx;

    .line 2460
    invoke-direct {v0, p0}, Lcx;-><init>(Lcu;)V

    .line 347
    iput-object v0, p0, Lcu;->a:Ljava/lang/Object;

    goto :goto_0
.end method

.method static synthetic a(Lcu;)Lcv;
    .locals 1

    .prologue
    .line 337
    iget-object v0, p0, Lcu;->b:Lcv;

    return-object v0
.end method

.method static synthetic a(Lcu;Landroid/os/Handler;)V
    .locals 2

    .prologue
    .line 337
    .line 3433
    new-instance v0, Lcv;

    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcv;-><init>(Lcu;Landroid/os/Looper;)V

    iput-object v0, p0, Lcu;->b:Lcv;

    .line 337
    return-void
.end method

.method static synthetic a(Lcu;Z)Z
    .locals 0

    .prologue
    .line 337
    iput-boolean p1, p0, Lcu;->c:Z

    return p1
.end method

.method static synthetic b(Lcu;)Z
    .locals 1

    .prologue
    .line 337
    iget-boolean v0, p0, Lcu;->c:Z

    return v0
.end method

.method static synthetic c(Lcu;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 337
    iget-object v0, p0, Lcu;->a:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 356
    return-void
.end method

.method public a(Lci;)V
    .locals 0

    .prologue
    .line 384
    return-void
.end method

.method public a(Ldq;)V
    .locals 0

    .prologue
    .line 375
    return-void
.end method

.method public binderDied()V
    .locals 0

    .prologue
    .line 426
    invoke-virtual {p0}, Lcu;->a()V

    .line 427
    return-void
.end method
