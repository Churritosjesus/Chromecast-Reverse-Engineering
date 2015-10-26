.class final Lanq;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field final synthetic a:Land;


# direct methods
.method constructor <init>(Land;)V
    .locals 0

    .prologue
    .line 1230
    iput-object p1, p0, Lanq;->a:Land;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 1230
    check-cast p1, Lbdf;

    .line 2234
    iget-object v0, p0, Lanq;->a:Land;

    iget-boolean v0, v0, Land;->u:Z

    if-nez v0, :cond_0

    .line 2237
    iget-object v0, p0, Lanq;->a:Land;

    invoke-static {v0, p1}, Land;->b(Land;Lbdf;)V

    .line 1230
    :cond_0
    return-void
.end method

.method public final b_(I)V
    .locals 6

    .prologue
    .line 1242
    iget-object v0, p0, Lanq;->a:Land;

    const-string v2, "Could not ping device"

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lanr;

    invoke-direct {v5, p0, p1}, Lanr;-><init>(Lanq;I)V

    move v1, p1

    invoke-virtual/range {v0 .. v5}, Land;->a(ILjava/lang/String;Lapd;ZLaoo;)V

    .line 1257
    return-void
.end method
