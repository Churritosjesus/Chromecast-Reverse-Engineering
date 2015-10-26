.class final Laln;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lals;


# instance fields
.field private synthetic a:Lalm;


# direct methods
.method constructor <init>(Lalm;)V
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Laln;->a:Lalm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laow;)V
    .locals 3

    .prologue
    .line 99
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 1597
    iget-object v2, p1, Laow;->c:Lbdf;

    .line 2254
    iget-object v2, v2, Lbdf;->b:Ljava/lang/String;

    .line 99
    aput-object v2, v0, v1

    .line 100
    iget-object v0, p0, Laln;->a:Lalm;

    .line 3051
    iget-object v1, v0, Lalm;->g:Ljava/util/List;

    .line 100
    monitor-enter v1

    .line 101
    :try_start_0
    iget-object v0, p0, Laln;->a:Lalm;

    .line 4051
    iget-object v0, v0, Lalm;->g:Ljava/util/List;

    .line 101
    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 102
    iget-object v2, p0, Laln;->a:Lalm;

    .line 5051
    iget-object v2, v2, Lalm;->d:Lbmu;

    .line 102
    if-eqz v2, :cond_0

    if-ltz v0, :cond_0

    .line 103
    iget-object v2, p0, Laln;->a:Lalm;

    .line 6051
    iget-object v2, v2, Lalm;->d:Lbmu;

    .line 103
    invoke-virtual {v2, v0}, Lbmu;->e(I)V

    .line 105
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
