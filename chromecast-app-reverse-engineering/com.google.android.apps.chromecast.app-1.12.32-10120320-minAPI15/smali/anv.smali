.class final Lanv;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field final synthetic a:Land;

.field private synthetic b:Lbdf;


# direct methods
.method constructor <init>(Land;Lbdf;)V
    .locals 0

    .prologue
    .line 1396
    iput-object p1, p0, Lanv;->a:Land;

    iput-object p2, p0, Lanv;->b:Lbdf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 1396
    check-cast p1, Lbdj;

    .line 2400
    iget-object v0, p0, Lanv;->b:Lbdf;

    if-eqz v0, :cond_1

    .line 2401
    iget-object v0, p0, Lanv;->b:Lbdf;

    .line 2623
    iput-object p1, v0, Lbdf;->G:Lbdj;

    .line 2402
    iget-object v0, p0, Lanv;->a:Land;

    invoke-static {v0}, Land;->t(Land;)Lazg;

    move-result-object v0

    invoke-virtual {v0}, Lazg;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2403
    iget-object v0, p0, Lanv;->a:Land;

    invoke-static {v0}, Land;->a(Land;)Lbdf;

    move-result-object v0

    .line 3254
    iget-object v0, v0, Lbdf;->b:Ljava/lang/String;

    .line 2404
    :goto_0
    iget-object v1, p0, Lanv;->b:Lbdf;

    .line 4247
    iput-object v0, v1, Lbdf;->b:Ljava/lang/String;

    .line 2405
    iget-object v0, p0, Lanv;->a:Land;

    iget-object v1, p0, Lanv;->b:Lbdf;

    invoke-static {v0, p1, v1}, Land;->a(Land;Lbdj;Lbdf;)V

    .line 2406
    :goto_1
    return-void

    .line 2403
    :cond_0
    iget-object v0, p0, Lanv;->a:Land;

    invoke-static {v0}, Land;->t(Land;)Lazg;

    move-result-object v0

    invoke-virtual {v0}, Lazg;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 2412
    :cond_1
    new-instance v0, Lanw;

    invoke-direct {v0, p0, p1}, Lanw;-><init>(Lanv;Lbdj;)V

    .line 2427
    iget-object v1, p0, Lanv;->a:Land;

    invoke-static {v1}, Land;->o(Land;)Lbdu;

    move-result-object v1

    const/16 v2, 0x4ae

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4, v0}, Lbdu;->a(ILjava/util/Locale;ZLbdn;)V

    goto :goto_1
.end method

.method public final b_(I)V
    .locals 6

    .prologue
    .line 1437
    iget-object v0, p0, Lanv;->a:Land;

    const-string v2, "save_wifi request failed"

    const/4 v3, 0x0

    const/4 v4, 0x1

    iget-object v1, p0, Lanv;->a:Land;

    .line 1438
    invoke-static {v1}, Land;->g(Land;)Laop;

    move-result-object v5

    move v1, p1

    .line 1437
    invoke-virtual/range {v0 .. v5}, Land;->a(ILjava/lang/String;Lapd;ZLaoo;)V

    .line 1439
    return-void
.end method
