.class final Lcjs;
.super Lcka;


# instance fields
.field private synthetic a:Lcjr;


# direct methods
.method constructor <init>(Lcjr;)V
    .locals 0

    iput-object p1, p0, Lcjs;->a:Lcjr;

    invoke-direct {p0}, Lcka;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget-object v0, p0, Lcjs;->a:Lcjr;

    invoke-static {v0}, Lcjr;->a(Lcjr;)Lbve;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcjs;->a:Lcjr;

    invoke-static {v0}, Lcjr;->a(Lcjr;)Lbve;

    move-result-object v0

    invoke-interface {v0, p1}, Lbve;->a(I)V

    :cond_0
    return-void
.end method
