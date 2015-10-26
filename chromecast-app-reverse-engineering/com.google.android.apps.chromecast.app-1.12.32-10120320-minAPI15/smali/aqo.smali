.class final Laqo;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbtr;


# instance fields
.field private synthetic a:Laqm;


# direct methods
.method constructor <init>(Laqm;)V
    .locals 0

    .prologue
    .line 289
    iput-object p1, p0, Laqo;->a:Laqm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 12

    .prologue
    const/4 v4, 0x2

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 292
    iget-object v0, p0, Laqo;->a:Laqm;

    iget-object v0, v0, Laqm;->a:Laqj;

    invoke-static {v0}, Laqj;->c(Laqj;)Lbtl;

    move-result-object v0

    invoke-virtual {v0}, Lbtl;->a()Lbtj;

    move-result-object v5

    .line 293
    if-eqz v5, :cond_1

    .line 294
    iget-object v0, p0, Laqo;->a:Laqm;

    iget-object v0, v0, Laqm;->a:Laqj;

    invoke-static {v0}, Laqj;->b(Laqj;)Laow;

    move-result-object v6

    .line 1330
    invoke-virtual {v6}, Laow;->o()Latu;

    move-result-object v7

    .line 2194
    iget-object v0, v7, Latu;->d:Latv;

    if-nez v0, :cond_5

    .line 2196
    new-instance v0, Latv;

    invoke-direct {v0}, Latv;-><init>()V

    iput-object v0, v7, Latu;->d:Latv;

    move v0, v1

    .line 3000
    :goto_0
    iget-wide v8, v5, Lbtj;->d:J

    const-wide/16 v10, 0x1

    and-long/2addr v8, v10

    const-wide/16 v10, 0x0

    cmp-long v3, v8, v10

    if-eqz v3, :cond_2

    move v3, v1

    .line 2200
    :goto_1
    if-eqz v3, :cond_4

    .line 4000
    iget v3, v5, Lbtj;->c:I

    .line 2202
    const/4 v8, 0x3

    if-ne v3, v8, :cond_3

    move v3, v4

    .line 2210
    :goto_2
    iget-object v5, v7, Latu;->d:Latv;

    .line 5316
    iget v5, v5, Latv;->a:I

    .line 2210
    if-eq v5, v3, :cond_0

    .line 2212
    iget-object v0, v7, Latu;->d:Latv;

    .line 6316
    iput v3, v0, Latv;->a:I

    move v0, v1

    .line 1330
    :cond_0
    if-eqz v0, :cond_1

    .line 1332
    invoke-virtual {v6}, Laow;->p()V

    .line 296
    :cond_1
    invoke-static {}, Laqj;->h()Lblp;

    new-array v0, v4, [Ljava/lang/Object;

    iget-object v3, p0, Laqo;->a:Laqm;

    iget-object v3, v3, Laqm;->a:Laqj;

    .line 297
    invoke-static {v3}, Laqj;->b(Laqj;)Laow;

    move-result-object v3

    invoke-virtual {v3}, Laow;->g()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v2

    iget-object v2, p0, Laqo;->a:Laqm;

    iget-object v2, v2, Laqm;->a:Laqj;

    .line 298
    invoke-static {v2}, Laqj;->b(Laqj;)Laow;

    move-result-object v2

    invoke-virtual {v2}, Laow;->o()Latu;

    move-result-object v2

    invoke-virtual {v2}, Latu;->a()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 299
    return-void

    :cond_2
    move v3, v2

    .line 3000
    goto :goto_1

    .line 5000
    :cond_3
    iget v3, v5, Lbtj;->c:I

    .line 2204
    if-ne v3, v4, :cond_4

    move v3, v1

    .line 2205
    goto :goto_2

    :cond_4
    move v3, v2

    .line 2207
    goto :goto_2

    :cond_5
    move v0, v2

    goto :goto_0
.end method
