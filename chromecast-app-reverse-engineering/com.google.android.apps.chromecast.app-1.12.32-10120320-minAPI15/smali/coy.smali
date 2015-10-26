.class public final Lcoy;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcou;

.field private synthetic b:Lcox;


# direct methods
.method public constructor <init>(Lcox;Lcou;)V
    .locals 0

    iput-object p1, p0, Lcoy;->b:Lcox;

    iput-object p2, p0, Lcoy;->a:Lcou;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 0
    iget-object v0, p0, Lcoy;->a:Lcou;

    .line 1000
    iget-object v0, v0, Lcou;->a:Lcow;

    .line 0
    iget-object v1, p0, Lcoy;->a:Lcou;

    invoke-virtual {v0, v1}, Lcow;->a(Lcou;)V

    iget-object v0, p0, Lcoy;->b:Lcox;

    invoke-static {v0}, Lcox;->a(Lcox;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcoy;->b:Lcox;

    iget-object v1, p0, Lcoy;->a:Lcou;

    invoke-static {v0, v1}, Lcox;->a(Lcox;Lcou;)V

    return-void
.end method
