.class final Lclq;
.super Ljava/lang/Object;

# interfaces
.implements Lbwd;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Landroid/content/Context;Landroid/os/Looper;Lbyl;Ljava/lang/Object;Lbwg;Lbwh;)Lbwc;
    .locals 8

    .prologue
    .line 0
    check-cast p4, Lclt;

    .line 1000
    if-nez p4, :cond_0

    sget-object v4, Lclt;->a:Lclt;

    :goto_0
    new-instance v0, Lctg;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Lctg;-><init>(Landroid/content/Context;Landroid/os/Looper;Lbyl;Lclt;Lbwg;Lbwh;Ljava/util/concurrent/ExecutorService;)V

    .line 0
    return-object v0

    :cond_0
    move-object v4, p4

    goto :goto_0
.end method
