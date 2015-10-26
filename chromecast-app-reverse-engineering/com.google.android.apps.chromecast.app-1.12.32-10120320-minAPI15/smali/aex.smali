.class public final Laex;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public a:Landroid/graphics/Bitmap;

.field final b:Laey;

.field public final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private synthetic e:Laer;


# direct methods
.method public constructor <init>(Laer;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Laey;)V
    .locals 0

    .prologue
    .line 338
    iput-object p1, p0, Laex;->e:Laer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 339
    iput-object p2, p0, Laex;->a:Landroid/graphics/Bitmap;

    .line 340
    iput-object p3, p0, Laex;->c:Ljava/lang/String;

    .line 341
    iput-object p4, p0, Laex;->d:Ljava/lang/String;

    .line 342
    iput-object p5, p0, Laex;->b:Laey;

    .line 343
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 349
    iget-object v0, p0, Laex;->b:Laey;

    if-nez v0, :cond_1

    .line 369
    :cond_0
    :goto_0
    return-void

    .line 353
    :cond_1
    iget-object v0, p0, Laex;->e:Laer;

    .line 1042
    iget-object v0, v0, Laer;->b:Ljava/util/HashMap;

    .line 353
    iget-object v1, p0, Laex;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laev;

    .line 354
    if-eqz v0, :cond_2

    .line 355
    invoke-virtual {v0, p0}, Laev;->a(Laex;)Z

    move-result v0

    .line 356
    if-eqz v0, :cond_0

    .line 357
    iget-object v0, p0, Laex;->e:Laer;

    .line 2042
    iget-object v0, v0, Laer;->b:Ljava/util/HashMap;

    .line 357
    iget-object v1, p0, Laex;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 361
    :cond_2
    iget-object v0, p0, Laex;->e:Laer;

    .line 3042
    iget-object v0, v0, Laer;->c:Ljava/util/HashMap;

    .line 361
    iget-object v1, p0, Laex;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laev;

    .line 362
    if-eqz v0, :cond_0

    .line 363
    invoke-virtual {v0, p0}, Laev;->a(Laex;)Z

    .line 3390
    iget-object v0, v0, Laev;->c:Ljava/util/LinkedList;

    .line 364
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 365
    iget-object v0, p0, Laex;->e:Laer;

    .line 4042
    iget-object v0, v0, Laer;->c:Ljava/util/HashMap;

    .line 365
    iget-object v1, p0, Laex;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method
