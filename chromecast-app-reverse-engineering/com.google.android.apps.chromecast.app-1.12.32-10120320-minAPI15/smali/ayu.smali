.class final Layu;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Ljava/util/List;

.field private synthetic b:I


# direct methods
.method constructor <init>(Layq;Ljava/util/List;I)V
    .locals 0

    .prologue
    .line 426
    iput-object p2, p0, Layu;->a:Ljava/util/List;

    iput p3, p0, Layu;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 429
    iget-object v0, p0, Layu;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Layw;

    .line 430
    iget v2, p0, Layu;->b:I

    invoke-interface {v0, v2}, Layw;->a(I)V

    goto :goto_0

    .line 432
    :cond_0
    return-void
.end method
