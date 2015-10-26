.class final Laeu;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Laer;


# direct methods
.method constructor <init>(Laer;)V
    .locals 0

    .prologue
    .line 461
    iput-object p1, p0, Laeu;->a:Laer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 464
    iget-object v0, p0, Laeu;->a:Laer;

    .line 1042
    iget-object v0, v0, Laer;->c:Ljava/util/HashMap;

    .line 464
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Laev;

    .line 1390
    iget-object v0, v1, Laev;->c:Ljava/util/LinkedList;

    .line 465
    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laex;

    .line 2316
    iget-object v4, v0, Laex;->b:Laey;

    .line 469
    if-eqz v4, :cond_1

    .line 2424
    iget-object v4, v1, Laev;->b:Laef;

    .line 472
    if-nez v4, :cond_2

    .line 3390
    iget-object v4, v1, Laev;->a:Landroid/graphics/Bitmap;

    .line 4316
    iput-object v4, v0, Laex;->a:Landroid/graphics/Bitmap;

    .line 5316
    iget-object v4, v0, Laex;->b:Laey;

    .line 474
    const/4 v5, 0x0

    invoke-interface {v4, v0, v5}, Laey;->a(Laex;Z)V

    goto :goto_0

    .line 6316
    :cond_2
    iget-object v0, v0, Laex;->b:Laey;

    .line 6424
    iget-object v4, v1, Laev;->b:Laef;

    .line 476
    invoke-interface {v0, v4}, Laey;->a(Laef;)V

    goto :goto_0

    .line 480
    :cond_3
    iget-object v0, p0, Laeu;->a:Laer;

    .line 7042
    iget-object v0, v0, Laer;->c:Ljava/util/HashMap;

    .line 480
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 481
    iget-object v0, p0, Laeu;->a:Laer;

    .line 8042
    const/4 v1, 0x0

    iput-object v1, v0, Laer;->d:Ljava/lang/Runnable;

    .line 482
    return-void
.end method
