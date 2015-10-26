.class final Lcun;
.super Ljava/lang/Object;

# interfaces
.implements Lcvp;


# instance fields
.field private synthetic a:Lcum;


# direct methods
.method constructor <init>(Lcum;)V
    .locals 0

    iput-object p1, p0, Lcun;->a:Lcum;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 2

    iget-object v0, p0, Lcun;->a:Lcum;

    iget-object v1, p0, Lcun;->a:Lcum;

    invoke-static {v1}, Lcum;->a(Lcum;)Z

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcum;->a(ZZ)V

    return-void
.end method
