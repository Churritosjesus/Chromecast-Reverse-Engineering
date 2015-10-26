.class final Lbhp;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field private synthetic a:Lbhf;


# direct methods
.method constructor <init>(Lbhf;)V
    .locals 0

    .prologue
    .line 843
    iput-object p1, p0, Lbhp;->a:Lbhf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .prologue
    .line 846
    iget-object v0, p0, Lbhp;->a:Lbhf;

    invoke-static {v0, p2}, Lbhf;->c(Lbhf;Z)V

    .line 847
    return-void
.end method
