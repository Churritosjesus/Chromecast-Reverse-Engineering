.class final Lanu;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field private synthetic a:Lbdf;

.field private synthetic b:Land;


# direct methods
.method constructor <init>(Land;Lbdf;)V
    .locals 0

    .prologue
    .line 1363
    iput-object p1, p0, Lanu;->b:Land;

    iput-object p2, p0, Lanu;->a:Lbdf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 1363
    check-cast p1, Lbdf;

    .line 2367
    iget-object v0, p0, Lanu;->b:Land;

    invoke-static {v0}, Land;->a(Land;)Lbdf;

    move-result-object v0

    .line 2759
    iget-object v1, p1, Lbdf;->W:Ljava/util/ArrayList;

    .line 2763
    iput-object v1, v0, Lbdf;->W:Ljava/util/ArrayList;

    .line 2368
    iget-object v0, p0, Lanu;->b:Land;

    invoke-static {v0}, Land;->a(Land;)Lbdf;

    move-result-object v0

    .line 2768
    iget-object v1, p1, Lbdf;->X:Ljava/util/ArrayList;

    .line 2772
    iput-object v1, v0, Lbdf;->X:Ljava/util/ArrayList;

    .line 2369
    iget-object v0, p0, Lanu;->b:Land;

    invoke-virtual {v0}, Land;->B()Lbdb;

    move-result-object v0

    .line 2370
    if-eqz v0, :cond_0

    .line 2371
    iget-object v1, p0, Lanu;->b:Land;

    invoke-static {v1}, Land;->t(Land;)Lazg;

    move-result-object v1

    const-string v2, "timezone"

    invoke-virtual {v1, v2, v0}, Lazg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2373
    :cond_0
    iget-object v0, p0, Lanu;->b:Land;

    invoke-virtual {v0}, Land;->C()Lbcz;

    move-result-object v0

    .line 2374
    if-eqz v0, :cond_1

    .line 2375
    iget-object v1, p0, Lanu;->b:Land;

    invoke-static {v1}, Land;->t(Land;)Lazg;

    move-result-object v1

    const-string v2, "locale"

    invoke-virtual {v1, v2, v0}, Lazg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2377
    :cond_1
    iget-object v0, p0, Lanu;->b:Land;

    iget-object v1, p0, Lanu;->a:Lbdf;

    invoke-static {v0, v1}, Land;->c(Land;Lbdf;)V

    .line 1363
    return-void
.end method

.method public final b_(I)V
    .locals 2

    .prologue
    .line 1383
    iget-object v0, p0, Lanu;->b:Land;

    iget-object v1, p0, Lanu;->a:Lbdf;

    invoke-static {v0, v1}, Land;->c(Land;Lbdf;)V

    .line 1384
    return-void
.end method
