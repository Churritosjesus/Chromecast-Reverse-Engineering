.class final Laxl;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laea;


# instance fields
.field private synthetic a:Laxk;


# direct methods
.method constructor <init>(Laxk;)V
    .locals 0

    .prologue
    .line 244
    iput-object p1, p0, Laxl;->a:Laxk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 244
    check-cast p1, Ldat;

    .line 1247
    iget-object v0, p0, Laxl;->a:Laxk;

    iget-object v0, v0, Laxk;->a:Laxd;

    .line 2029
    iput-object p1, v0, Laxd;->d:Ldat;

    .line 1248
    iget-object v0, p0, Laxl;->a:Laxk;

    iget-object v0, v0, Laxk;->a:Laxd;

    .line 3029
    iget-object v0, v0, Laxd;->h:Laxn;

    .line 1248
    if-eqz v0, :cond_0

    .line 1249
    iget-object v0, p0, Laxl;->a:Laxk;

    iget-object v0, v0, Laxk;->a:Laxd;

    .line 4029
    iget-object v0, v0, Laxd;->h:Laxn;

    .line 1249
    iget-object v1, p1, Ldat;->a:[Ldau;

    invoke-interface {v0, v1}, Laxn;->a([Ldau;)V

    .line 1251
    :cond_0
    iget-object v0, p0, Laxl;->a:Laxk;

    iget-object v0, v0, Laxk;->a:Laxd;

    const/4 v1, 0x0

    .line 5029
    iput-object v1, v0, Laxd;->k:Laef;

    .line 1252
    iget-object v0, p0, Laxl;->a:Laxk;

    iget-object v0, v0, Laxk;->a:Laxd;

    invoke-static {v0}, Laxd;->a(Laxd;)V

    .line 244
    return-void
.end method
