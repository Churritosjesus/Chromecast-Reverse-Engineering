.class final Lcxk;
.super Ljava/lang/Object;

# interfaces
.implements Lcyw;


# direct methods
.method constructor <init>(Lcxi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .prologue
    .line 0
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lcxo;

    .line 1000
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    .line 2000
    iget-object v0, p2, Lcxo;->a:Lcwj;

    .line 3000
    iget-object v0, v0, Lcwj;->a:Ljava/lang/Object;

    .line 2000
    check-cast v0, Lcje;

    invoke-virtual {v0}, Lcje;->e()I

    move-result v2

    iget-object v0, p2, Lcxo;->b:Lcje;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    add-int/2addr v0, v2

    .line 1000
    add-int/2addr v0, v1

    .line 0
    return v0

    .line 2000
    :cond_0
    iget-object v0, p2, Lcxo;->b:Lcje;

    invoke-virtual {v0}, Lcje;->e()I

    move-result v0

    goto :goto_0
.end method
