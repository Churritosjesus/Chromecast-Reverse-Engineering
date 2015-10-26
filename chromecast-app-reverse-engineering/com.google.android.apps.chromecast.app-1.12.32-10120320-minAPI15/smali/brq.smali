.class final Lbrq;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lbrn;


# direct methods
.method constructor <init>(Lbrn;)V
    .locals 0

    iput-object p1, p0, Lbrq;->a:Lbrn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lbrq;->a:Lbrn;

    invoke-virtual {v0}, Lbrn;->c()V

    return-void
.end method
