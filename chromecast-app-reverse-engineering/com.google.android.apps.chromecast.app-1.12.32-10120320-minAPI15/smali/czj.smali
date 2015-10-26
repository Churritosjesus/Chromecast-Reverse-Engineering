.class final Lczj;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Lczg;


# direct methods
.method constructor <init>(Lczg;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lczj;->b:Lczg;

    iput-object p2, p0, Lczj;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lczj;->b:Lczg;

    iget-object v1, p0, Lczj;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lczg;->a(Lczg;Ljava/lang/String;)V

    return-void
.end method
