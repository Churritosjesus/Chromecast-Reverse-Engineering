.class final Lcxg;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lclv;

.field private synthetic b:Lctv;


# direct methods
.method constructor <init>(Lctv;Lclv;)V
    .locals 0

    iput-object p1, p0, Lcxg;->b:Lctv;

    iput-object p2, p0, Lcxg;->a:Lclv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcxg;->b:Lctv;

    iget-object v1, p0, Lcxg;->a:Lclv;

    invoke-virtual {v0, v1}, Lctv;->b(Lclv;)Z

    return-void
.end method
