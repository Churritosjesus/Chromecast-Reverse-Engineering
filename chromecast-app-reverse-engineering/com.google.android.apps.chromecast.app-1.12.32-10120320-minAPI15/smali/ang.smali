.class final Lang;
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
    .line 615
    iput-object p1, p0, Lang;->c:Land;

    iput-object p2, p0, Lang;->a:Lapd;

    iput-object p3, p0, Lang;->b:Laop;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 615
    .line 1619
    iget-object v0, p0, Lang;->a:Lapd;

    if-eqz v0, :cond_0

    .line 1620
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lang;->a:Lapd;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 1622
    :cond_0
    iget-object v0, p0, Lang;->b:Laop;

    invoke-interface {v0}, Laop;->a()V

    .line 1623
    iget-object v0, p0, Lang;->c:Land;

    invoke-virtual {v0}, Land;->y()V

    .line 615
    return-void
.end method

.method public final b_(I)V
    .locals 6

    .prologue
    .line 628
    iget-object v0, p0, Lang;->c:Land;

    const-string v2, "Could not set device info"

    iget-object v3, p0, Lang;->a:Lapd;

    const/4 v4, 0x1

    iget-object v5, p0, Lang;->b:Laop;

    move v1, p1

    invoke-virtual/range {v0 .. v5}, Land;->a(ILjava/lang/String;Lapd;ZLaoo;)V

    .line 630
    return-void
.end method
