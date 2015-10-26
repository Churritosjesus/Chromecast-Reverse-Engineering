.class final Lanm;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field private synthetic a:Lapd;

.field private synthetic b:Land;


# direct methods
.method constructor <init>(Land;Lapd;)V
    .locals 0

    .prologue
    .line 972
    iput-object p1, p0, Lanm;->b:Land;

    iput-object p2, p0, Lanm;->a:Lapd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 972
    .line 1976
    iget-object v0, p0, Lanm;->b:Land;

    iget-boolean v0, v0, Land;->u:Z

    if-eqz v0, :cond_0

    .line 1977
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lanm;->a:Lapd;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 1983
    :goto_0
    return-void

    .line 1980
    :cond_0
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lanm;->a:Lapd;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 1981
    iget-object v0, p0, Lanm;->b:Land;

    invoke-static {v0}, Land;->c(Land;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1983
    iget-object v0, p0, Lanm;->b:Land;

    invoke-static {v0}, Land;->f(Land;)V

    goto :goto_0

    .line 1987
    :cond_1
    iget-object v0, p0, Lanm;->b:Land;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Land;->a(Land;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final b_(I)V
    .locals 6

    .prologue
    .line 993
    iget-object v0, p0, Lanm;->b:Land;

    const-string v2, "connect_wifi request failed"

    iget-object v3, p0, Lanm;->a:Lapd;

    const/4 v4, 0x1

    iget-object v1, p0, Lanm;->b:Land;

    .line 994
    invoke-static {v1}, Land;->g(Land;)Laop;

    move-result-object v5

    move v1, p1

    .line 993
    invoke-virtual/range {v0 .. v5}, Land;->a(ILjava/lang/String;Lapd;ZLaoo;)V

    .line 995
    return-void
.end method
