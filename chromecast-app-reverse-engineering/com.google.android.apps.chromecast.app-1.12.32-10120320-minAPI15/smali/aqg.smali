.class final Laqg;
.super Lapt;
.source "PG"


# instance fields
.field final synthetic a:Laqd;

.field private final b:Z


# direct methods
.method public constructor <init>(Laqd;Z)V
    .locals 0

    .prologue
    .line 206
    iput-object p1, p0, Laqg;->a:Laqd;

    invoke-direct {p0}, Lapt;-><init>()V

    .line 207
    iput-boolean p2, p0, Laqg;->b:Z

    .line 208
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 246
    iget-object v0, p0, Laqg;->a:Laqd;

    const/4 v1, 0x1

    .line 9025
    iput-boolean v1, v0, Laqd;->j:Z

    .line 247
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 212
    iget-object v0, p0, Laqg;->a:Laqd;

    .line 1025
    iget-boolean v0, v0, Laqd;->j:Z

    .line 212
    if-eqz v0, :cond_0

    .line 213
    iget-object v0, p0, Laqg;->a:Laqd;

    .line 2025
    iput-boolean v4, v0, Laqd;->j:Z

    .line 242
    :goto_0
    return-void

    .line 218
    :cond_0
    new-instance v0, Laqh;

    invoke-direct {v0, p0}, Laqh;-><init>(Laqg;)V

    .line 233
    :try_start_0
    iget-boolean v1, p0, Laqg;->b:Z

    if-eqz v1, :cond_1

    .line 234
    iget-object v1, p0, Laqg;->a:Laqd;

    .line 3025
    iget-object v1, v1, Laqd;->h:Lapk;

    .line 234
    iget-object v2, p0, Laqg;->a:Laqd;

    .line 4025
    iget-object v2, v2, Laqd;->c:Ljava/lang/String;

    .line 234
    invoke-virtual {v1, v2, v0}, Lapk;->b(Ljava/lang/String;Lbwn;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 238
    :catch_0
    move-exception v0

    .line 239
    iget-object v1, p0, Laqg;->a:Laqd;

    .line 7025
    iget-object v1, v1, Laqd;->a:Lblp;

    .line 239
    const-string v2, "Failed to launch application: %s"

    new-array v3, v5, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    iget-object v0, p0, Laqg;->a:Laqd;

    .line 8025
    invoke-virtual {v0, v5}, Laqd;->a(Z)V

    goto :goto_0

    .line 236
    :cond_1
    :try_start_1
    iget-object v1, p0, Laqg;->a:Laqd;

    .line 5025
    iget-object v1, v1, Laqd;->h:Lapk;

    .line 236
    iget-object v2, p0, Laqg;->a:Laqd;

    .line 6025
    iget-object v2, v2, Laqd;->c:Ljava/lang/String;

    .line 236
    invoke-virtual {v1, v2, v0}, Lapk;->a(Ljava/lang/String;Lbwn;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method public final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    .prologue
    .line 251
    iget-object v0, p0, Laqg;->a:Laqd;

    .line 10025
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Laqd;->a(Z)V

    .line 252
    return-void
.end method
