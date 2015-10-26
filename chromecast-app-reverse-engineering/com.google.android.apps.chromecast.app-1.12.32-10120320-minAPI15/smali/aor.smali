.class public final Laor;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# static fields
.field private static final a:Lblp;

.field private static final d:Ljava/util/concurrent/ScheduledExecutorService;

.field private static final g:Ljava/lang/Runnable;


# instance fields
.field private b:I

.field private c:I

.field private e:Ljava/util/concurrent/Future;

.field private final f:J

.field private final h:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 25
    new-instance v0, Lblp;

    const-string v1, "SetupApplicationLifecycleHandler"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    sput-object v0, Laor;->a:Lblp;

    .line 30
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Laor;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 36
    new-instance v0, Laos;

    invoke-direct {v0}, Laos;-><init>()V

    sput-object v0, Laor;->g:Ljava/lang/Runnable;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-static {v0}, Lblf;->u(Landroid/content/Context;)J

    move-result-wide v0

    iput-wide v0, p0, Laor;->f:J

    .line 44
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Laor;->h:Ljava/util/Set;

    return-void
.end method

.method static synthetic a(Laor;)I
    .locals 2

    .prologue
    .line 23
    iget v0, p0, Laor;->c:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Laor;->c:I

    return v0
.end method

.method static synthetic a()Lblp;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Laor;->a:Lblp;

    return-object v0
.end method

.method static synthetic a(Laor;Ljava/util/concurrent/Future;)Ljava/util/concurrent/Future;
    .locals 0

    .prologue
    .line 23
    iput-object p1, p0, Laor;->e:Ljava/util/concurrent/Future;

    return-object p1
.end method

.method static synthetic b(Laor;)I
    .locals 1

    .prologue
    .line 23
    iget v0, p0, Laor;->c:I

    return v0
.end method

.method static synthetic b()Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Laor;->g:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic c(Laor;)Ljava/util/concurrent/Future;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Laor;->e:Ljava/util/concurrent/Future;

    return-object v0
.end method

.method static synthetic c()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Laor;->d:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method static synthetic d(Laor;)J
    .locals 2

    .prologue
    .line 23
    iget-wide v0, p0, Laor;->f:J

    return-wide v0
.end method

.method static synthetic e(Laor;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Laor;->h:Ljava/util/Set;

    return-object v0
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 48
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 52
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 5

    .prologue
    .line 87
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Laor;->c:I

    add-int/lit8 v2, v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 88
    new-instance v0, Laot;

    invoke-direct {v0, p0}, Laot;-><init>(Laor;)V

    .line 110
    sget-object v1, Laor;->d:Ljava/util/concurrent/ScheduledExecutorService;

    const-wide/16 v2, 0x7d0

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v0, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 112
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 72
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Laor;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v3

    const/4 v1, 0x1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 73
    iget v0, p0, Laor;->c:I

    if-nez v0, :cond_0

    .line 75
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    .line 1070
    iget-object v1, v0, Lape;->a:Ljava/util/Random;

    invoke-virtual {v1}, Ljava/util/Random;->nextInt()I

    move-result v1

    iput v1, v0, Lape;->g:I

    .line 76
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    const/16 v1, 0x6c

    invoke-virtual {v0, v1}, Lape;->b(I)V

    .line 77
    iget-object v0, p0, Laor;->e:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    .line 78
    iget-object v0, p0, Laor;->e:Ljava/util/concurrent/Future;

    invoke-interface {v0, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Laor;->e:Ljava/util/concurrent/Future;

    .line 82
    :cond_0
    iget v0, p0, Laor;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Laor;->c:I

    .line 83
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 68
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 56
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Laor;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 57
    iget v0, p0, Laor;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Laor;->b:I

    .line 58
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 62
    iget v0, p0, Laor;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Laor;->b:I

    .line 63
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Laor;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 64
    return-void
.end method
