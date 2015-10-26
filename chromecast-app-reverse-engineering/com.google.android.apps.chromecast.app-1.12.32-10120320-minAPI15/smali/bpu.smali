.class final Lbpu;
.super Lbra;


# instance fields
.field private a:Z


# direct methods
.method protected constructor <init>(Lbps;Lbrb;)V
    .locals 0

    invoke-direct {p0, p2}, Lbra;-><init>(Lbrb;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 0

    return-void
.end method

.method public final declared-synchronized b()Z
    .locals 2

    const/4 v1, 0x0

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lbpu;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
