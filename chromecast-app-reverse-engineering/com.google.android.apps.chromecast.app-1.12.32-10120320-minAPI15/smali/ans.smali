.class final Lans;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lapd;

.field private synthetic b:Layq;

.field private synthetic c:J

.field private synthetic d:Lbdf;

.field private synthetic e:Land;


# direct methods
.method constructor <init>(Land;Lapd;Layq;JLbdf;)V
    .locals 0

    .prologue
    .line 1277
    iput-object p1, p0, Lans;->e:Land;

    iput-object p2, p0, Lans;->a:Lapd;

    iput-object p3, p0, Lans;->b:Layq;

    iput-wide p4, p0, Lans;->c:J

    iput-object p6, p0, Lans;->d:Lbdf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 1281
    iget-object v0, p0, Lans;->e:Land;

    iget-boolean v0, v0, Land;->u:Z

    if-eqz v0, :cond_0

    .line 1282
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lans;->a:Lapd;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 1306
    :goto_0
    return-void

    .line 1285
    :cond_0
    iget-object v0, p0, Lans;->b:Layq;

    invoke-virtual {v0}, Layq;->c()V

    .line 1286
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 1287
    iget-wide v2, p0, Lans;->c:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 1289
    iget-object v0, p0, Lans;->e:Land;

    invoke-static {v0}, Land;->l(Land;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lans;->e:Land;

    invoke-static {v1}, Land;->s(Land;)I

    move-result v1

    int-to-long v2, v1

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1290
    iget-object v0, p0, Lans;->e:Land;

    iget-object v1, p0, Lans;->b:Layq;

    invoke-static {v0, v1}, Land;->a(Land;Layq;)Z

    goto :goto_0

    .line 1292
    :cond_1
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lans;->a:Lapd;

    invoke-virtual {v1, v5}, Lapd;->a(I)Lapd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 1293
    iget-object v0, p0, Lans;->d:Lbdf;

    if-eqz v0, :cond_2

    .line 1294
    iget-object v0, p0, Lans;->e:Land;

    sget v1, Lb;->dE:I

    invoke-virtual {v0, v1}, Land;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 1296
    :goto_1
    iget-object v0, p0, Lans;->e:Land;

    invoke-static {v0}, Land;->c(Land;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1297
    iget-object v0, p0, Lans;->e:Land;

    iget-object v1, p0, Lans;->e:Land;

    sget v2, Lb;->dx:I

    new-array v3, v6, [Ljava/lang/Object;

    iget-object v6, p0, Lans;->e:Land;

    .line 1298
    invoke-virtual {v6}, Land;->D()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v5

    invoke-virtual {v1, v2, v3}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget v2, Lb;->dy:I

    sget v3, Lb;->dz:I

    .line 1297
    invoke-static/range {v0 .. v5}, Land;->a(Land;Ljava/lang/String;IILjava/lang/String;Z)V

    goto :goto_0

    .line 1295
    :cond_2
    iget-object v0, p0, Lans;->e:Land;

    sget v1, Lb;->dD:I

    invoke-virtual {v0, v1}, Land;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    .line 1302
    :cond_3
    iget-object v0, p0, Lans;->e:Land;

    iget-object v1, p0, Lans;->e:Land;

    sget v2, Lb;->aA:I

    new-array v3, v6, [Ljava/lang/Object;

    iget-object v6, p0, Lans;->e:Land;

    .line 1303
    invoke-virtual {v6}, Land;->D()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v5

    .line 1302
    invoke-virtual {v1, v2, v3}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4}, Land;->b(Land;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0
.end method
