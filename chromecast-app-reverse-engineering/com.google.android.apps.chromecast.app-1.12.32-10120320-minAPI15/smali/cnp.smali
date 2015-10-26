.class final Lcnp;
.super Ljava/lang/Object;

# interfaces
.implements Lcoh;


# instance fields
.field private synthetic a:Lcno;


# direct methods
.method constructor <init>(Lcno;)V
    .locals 0

    iput-object p1, p0, Lcnp;->a:Lcno;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcnp;->a:Lcno;

    invoke-static {v0}, Lcno;->a(Lcno;)V

    return-void
.end method

.method public final synthetic b()Landroid/os/IInterface;
    .locals 1

    .prologue
    .line 0
    .line 1000
    iget-object v0, p0, Lcnp;->a:Lcno;

    invoke-virtual {v0}, Lcno;->o()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcnu;

    .line 0
    return-object v0
.end method
