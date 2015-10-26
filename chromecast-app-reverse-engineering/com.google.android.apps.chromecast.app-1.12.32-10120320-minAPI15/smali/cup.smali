.class final Lcup;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcum;


# direct methods
.method constructor <init>(Lcum;)V
    .locals 0

    iput-object p1, p0, Lcup;->a:Lcum;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcup;->a:Lcum;

    invoke-static {v0}, Lcum;->e(Lcum;)Lcvo;

    move-result-object v0

    invoke-interface {v0}, Lcvo;->a()V

    return-void
.end method
