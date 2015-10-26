.class final Lbrj;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Landroid/content/ComponentName;

.field private synthetic b:Lbrh;


# direct methods
.method constructor <init>(Lbrh;Landroid/content/ComponentName;)V
    .locals 0

    iput-object p1, p0, Lbrj;->b:Lbrh;

    iput-object p2, p0, Lbrj;->a:Landroid/content/ComponentName;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lbrj;->b:Lbrh;

    iget-object v0, v0, Lbrh;->a:Lbrf;

    iget-object v1, p0, Lbrj;->a:Landroid/content/ComponentName;

    invoke-static {v0, v1}, Lbrf;->a(Lbrf;Landroid/content/ComponentName;)V

    return-void
.end method
