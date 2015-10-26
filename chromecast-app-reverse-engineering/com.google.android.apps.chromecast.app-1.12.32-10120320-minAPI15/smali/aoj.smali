.class final Laoj;
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
    .line 456
    iput-object p1, p0, Laoj;->c:Land;

    iput-object p2, p0, Laoj;->a:Lapd;

    iput-object p3, p0, Laoj;->b:Laop;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 456
    check-cast p1, Ljava/util/ArrayList;

    .line 1460
    iget-object v0, p0, Laoj;->c:Land;

    invoke-static {v0, p1}, Land;->a(Land;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 1461
    invoke-static {}, Lape;->a()Lape;

    move-result-object v1

    iget-object v2, p0, Laoj;->a:Lapd;

    iget-object v0, p0, Laoj;->c:Land;

    .line 1462
    invoke-static {v0}, Land;->d(Land;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Laoj;->c:Land;

    invoke-static {v0}, Land;->d(Land;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    invoke-virtual {v2, v0}, Lapd;->a(I)Lapd;

    move-result-object v0

    iget-object v2, p0, Laoj;->c:Land;

    .line 1463
    invoke-virtual {v2}, Land;->A()Laph;

    move-result-object v2

    .line 2115
    iput-object v2, v0, Lapd;->h:Laph;

    .line 1461
    invoke-virtual {v1, v0}, Lape;->a(Lapd;)V

    .line 1464
    iget-object v0, p0, Laoj;->b:Laop;

    invoke-interface {v0}, Laop;->a()V

    .line 456
    return-void

    .line 1462
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b_(I)V
    .locals 6

    .prologue
    .line 469
    iget-object v0, p0, Laoj;->c:Land;

    const-string v2, "Could not get network list"

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Laoj;->b:Laop;

    move v1, p1

    invoke-virtual/range {v0 .. v5}, Land;->a(ILjava/lang/String;Lapd;ZLaoo;)V

    .line 471
    return-void
.end method
