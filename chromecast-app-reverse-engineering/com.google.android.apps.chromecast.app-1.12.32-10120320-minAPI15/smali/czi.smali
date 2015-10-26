.class final Lczi;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcuc;

.field private synthetic b:Lczg;


# direct methods
.method constructor <init>(Lczg;Lcuc;)V
    .locals 0

    iput-object p1, p0, Lczi;->b:Lczg;

    iput-object p2, p0, Lczi;->a:Lcuc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lczi;->a:Lcuc;

    iget-object v1, p0, Lczi;->b:Lczg;

    invoke-static {v1}, Lczg;->a(Lczg;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcuc;->a(Ljava/util/List;)V

    return-void
.end method
