.class final Laoi;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field private synthetic a:Lapd;

.field private synthetic b:Laop;

.field private synthetic c:Land;


# direct methods
.method constructor <init>(Land;Lapd;Laop;)V
    .locals 0

    .prologue
    .line 425
    iput-object p1, p0, Laoi;->c:Land;

    iput-object p2, p0, Laoi;->a:Lapd;

    iput-object p3, p0, Laoi;->b:Laop;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 425
    check-cast p1, Lbdf;

    .line 1428
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Laoi;->a:Lapd;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 1429
    iget-object v0, p0, Laoi;->c:Land;

    invoke-static {v0, p1}, Land;->a(Land;Lbdf;)Lbdf;

    .line 1430
    iget-object v0, p0, Laoi;->c:Land;

    iget-object v1, p0, Laoi;->b:Laop;

    invoke-static {v0, v1}, Land;->a(Land;Laop;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1433
    iget-object v0, p0, Laoi;->c:Land;

    invoke-static {v0}, Land;->c(Land;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1434
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    new-instance v1, Lapd;

    const/16 v2, 0x52

    invoke-direct {v1, v2}, Lapd;-><init>(I)V

    .line 1436
    invoke-virtual {p1}, Lbdf;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    .line 1636
    iget v2, p1, Lbdf;->H:I

    .line 1437
    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Lapd;->a(J)Lapd;

    move-result-object v1

    .line 1434
    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 1439
    :cond_0
    iget-object v0, p0, Laoi;->b:Laop;

    invoke-interface {v0}, Laop;->a()V

    .line 425
    :cond_1
    return-void
.end method

.method public final b_(I)V
    .locals 6

    .prologue
    .line 444
    iget-object v0, p0, Laoi;->c:Land;

    const-string v2, "Could not get device info"

    iget-object v3, p0, Laoi;->a:Lapd;

    const/4 v4, 0x0

    iget-object v5, p0, Laoi;->b:Laop;

    move v1, p1

    invoke-virtual/range {v0 .. v5}, Land;->a(ILjava/lang/String;Lapd;ZLaoo;)V

    .line 446
    return-void
.end method
