.class final Lczr;
.super Landroid/database/ContentObserver;
.source "PG"


# instance fields
.field private synthetic a:Lczq;


# direct methods
.method constructor <init>(Lczq;Landroid/os/Handler;)V
    .locals 0

    .prologue
    .line 75
    iput-object p1, p0, Lczr;->a:Lczq;

    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final onChange(Z)V
    .locals 3

    .prologue
    .line 77
    const-class v1, Lczp;

    monitor-enter v1

    .line 78
    :try_start_0
    invoke-static {}, Lczp;->a()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 79
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lczp;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    invoke-static {}, Lczp;->b()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_0

    .line 81
    iget-object v0, p0, Lczr;->a:Lczq;

    iget-object v0, v0, Lczq;->a:Landroid/content/ContentResolver;

    invoke-static {}, Lczp;->b()[Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lczp;->a(Landroid/content/ContentResolver;[Ljava/lang/String;)V

    .line 83
    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
