.class public Laeb;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .prologue
    .line 3034
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3036
    new-instance v0, Ladk;

    invoke-direct {v0, p0, p1}, Ladk;-><init>(Laeb;Landroid/os/Handler;)V

    iput-object v0, p0, Laeb;->a:Ljava/util/concurrent/Executor;

    .line 3042
    return-void
.end method


# virtual methods
.method public a(Lads;Lady;)V
    .locals 1

    .prologue
    .line 1055
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Laeb;->a(Lads;Lady;Ljava/lang/Runnable;)V

    .line 1056
    return-void
.end method

.method public a(Lads;Lady;Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 1060
    .line 1528
    const/4 v0, 0x1

    iput-boolean v0, p1, Lads;->h:Z

    .line 1061
    const-string v0, "post-response"

    invoke-virtual {p1, v0}, Lads;->a(Ljava/lang/String;)V

    .line 1062
    iget-object v0, p0, Laeb;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Ladl;

    invoke-direct {v1, p0, p1, p2, p3}, Ladl;-><init>(Laeb;Lads;Lady;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1063
    return-void
.end method

.method public a(Lads;Laef;)V
    .locals 4

    .prologue
    .line 2067
    const-string v0, "post-error"

    invoke-virtual {p1, v0}, Lads;->a(Ljava/lang/String;)V

    .line 2068
    invoke-static {p2}, Lady;->a(Laef;)Lady;

    move-result-object v0

    .line 2069
    iget-object v1, p0, Laeb;->a:Ljava/util/concurrent/Executor;

    new-instance v2, Ladl;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v0, v3}, Ladl;-><init>(Laeb;Lads;Lady;Ljava/lang/Runnable;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 2070
    return-void
.end method
