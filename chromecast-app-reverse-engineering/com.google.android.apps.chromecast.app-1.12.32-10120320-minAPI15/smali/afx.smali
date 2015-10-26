.class final Lafx;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private synthetic a:Ls;


# direct methods
.method constructor <init>(Ls;)V
    .locals 0

    .prologue
    .line 213
    iput-object p1, p0, Lafx;->a:Ls;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 213
    .line 1216
    invoke-static {}, Laff;->a()Laff;

    move-result-object v0

    .line 2102
    iget-object v1, v0, Laff;->a:Lafd;

    invoke-virtual {v1}, Lafd;->a()Lafb;

    move-result-object v1

    .line 2104
    if-eqz v1, :cond_0

    .line 2105
    invoke-virtual {v0, v1, v2}, Laff;->a(Lafb;Z)V

    .line 1217
    :cond_0
    invoke-static {}, Lagx;->a()Lagx;

    move-result-object v0

    .line 3074
    iget-object v1, v0, Lagx;->a:Lagw;

    invoke-virtual {v1}, Lagw;->a()Lagt;

    move-result-object v1

    .line 3076
    if-eqz v1, :cond_1

    .line 3077
    invoke-virtual {v0, v1, v2}, Lagx;->a(Lagt;Z)V

    .line 1218
    :cond_1
    invoke-static {}, Lafb;->a()Lafb;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1219
    invoke-static {}, Lagt;->a()Lagt;

    move-result-object v0

    if-nez v0, :cond_2

    .line 1222
    invoke-static {}, Lagt;->b()V

    .line 1228
    :cond_2
    const/4 v0, 0x0

    .line 213
    return-object v0
.end method
